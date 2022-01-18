//package LinkedList2;
//
//public class SingleLinkedList {
//
//    Node start;
//
//    SingleLinkedList(){
//        start = null;
//    }
//
//    void createList(int inputData) {
//        Node node = new Node(inputData);
//        start = node;
//    }
//
//    void insertBegin(int inputData){
//        if (start == null){
//            createList(inputData);
//            return;
//        }
//
//        Node node = new Node(inputData);
//
//        node.next = start;
//        start = node;
//    }
////
////    int delBegin(){
////        if (start==null){
////            System.out.println("no nodes present");
////            return 404;
////        }
////
////        Node node = start;
////        start = start.next;
////        node.next = null;
////        return node.data;
////    }
////
////    void insertEnd(int inputData){
////        if (start == null){
////            createList(inputData);
////            return;
////        }
////
////        Node current = start;
////
////        while (current.next!=null){
////            current = current.next;
////        }
////
////        Node node = new Node(inputData);
////        current.next = node;
////    }
////
//    int deleteEnd(){
//        if (start==null){
//            System.out.println("no nodes present");
//            return 404;
//        }
//
//        Node current = start;
//
//        if (start.next==null){
//            Node node = start;
//            start = null;
//            return node.data;
//        }
//
//        while (current.next.next!=null){
//            current = current.next;
//        }
//
//        Node node = current.next;
//        current.next = null;
//        return node.data;
//    }
//    void printList(){
//
//        Node current = start;
//
//        System.out.println("-----------");
//        while (current!=null){
//            System.out.println(current.data);
//            current = current.next;
//        }
//        System.out.println("-----------");
//    }
//}
