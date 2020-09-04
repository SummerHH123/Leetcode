package _1_Array.Leetcode;
    public class Main {
        public static void main(String[] args) {
            Animal dog = new Dog();
            dog.start();

            Animal cat = new Cat();
            cat.start();

        }
    }
    // 抽象的父类
    abstract class Animal{
        // 定义抽象方法
        abstract void eat();
        abstract void run();

        // 定义具体的模板方法
        public void start(){
            // 定义一个框架，确定方法的执行步骤
            eat();
            run();
        }
    }
    // 定于子类
    class Dog extends Animal{
        @Override
        void eat() {
            System.out.println("我是小狗，我在吃东西...");
        }

        @Override
        void run() {
            System.out.println("我是小狗，我在跑步...");
        }
    }

    class Cat extends Animal{
        @Override
        void eat() {
            washHand();
            System.out.println("我是小猫，我在吃东西...");
        }

        @Override
        void run() {
            System.out.println("我是小猫，我在跑步...");
        }

        // 其余业务逻辑
        private void washHand(){
            System.out.println("我是小猫，我在洗手...");
        }
    }
