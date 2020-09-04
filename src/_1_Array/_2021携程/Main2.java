package _1_Array._2021携程;

import java.util.*;
import java.util.stream.Collectors;

class WorkflowNode {
    String nodeId;
    int timeoutMillis;
    List<WorkflowNode> nextNodes;
    boolean initialised;

    public static WorkflowNode load(String value) {
        // Create head node;
        Map<String, WorkflowNode> map = new HashMap<>();
        WorkflowNode head = new WorkflowNode("HEAD", 0, null);
        map.put(head.nodeId, head);

        for (String nodeValue : value.split("\\|")) {
            String[] properties = nodeValue.split("\\`");
            WorkflowNode node = map.get(properties[0]);

            node.timeoutMillis = Integer.parseInt(properties[1]);
            node.initialised = true;

            // Check next nodes
            if (properties[2].equals("END")) {
                continue;
            }
            node.nextNodes = Arrays.stream(properties[2].split(","))
                    .map(p -> new WorkflowNode(p, 0, null))
                    .collect(Collectors.toList());
            node.nextNodes.forEach(p -> map.put(p.nodeId, p));

            map.put(node.nodeId, node);
        }

        return head;
    }

    public WorkflowNode(String nodeId, int timeoutMillis, List<WorkflowNode> nextNodes) {
        this.nodeId = nodeId;
        this.timeoutMillis = timeoutMillis;
        this.nextNodes = nextNodes;
    }
}

public class Main2 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            try {
                WorkflowNode node = WorkflowNode.load(cin.next());
                System.out.println(dfs(node));
            }catch (Exception e){
                System.out.println(-1);
            }

        }
    }
    static long now=0;

    private static long dfs(WorkflowNode node) {


        if (node.nextNodes == null) {
            return node.timeoutMillis;
        }
        List<Long> list=new ArrayList<>();
        for (int i = 0; i < node.nextNodes.size(); i++) {
//            now = Math.max(now, dfs(node.nextNodes.get(i)));
            list.add(dfs(node.nextNodes.get(i)));
        }
//        return Math.max(node.timeoutMillis);

        return Collections.max(list)+node.timeoutMillis;
    }
    //HEAD`0`A,B,C|A`20`END|B`100`END|C`50`D,E|D`80`F|E`150`END|F`30`END


}