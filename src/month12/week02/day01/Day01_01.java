package month12.week02.day01;

public class Day01_01 {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1,2);
        myHashMap.put(2,3);
        myHashMap.put(2,2);
        myHashMap.remove(6);
        int res=myHashMap.get(2);
        System.out.println(res);
    }
}
class MyHashMap{
    Node head;
    public void put(int key,int value){
        if(head==null){
            Node node=new Node();
            head=node;
            head.key=key;
            head.value=value;
            return;
        }
        Node curNode = head;
        while(true) {
            //看链表的key中有没有与key相同的
            if (curNode.key == key) {
                curNode.value = value;
                return;
            }
            if(curNode.next==null){
                Node node=new Node();
                curNode.next=node;
                node.key=key;
                node.value=value;
                return;
            }
            curNode=curNode.next;
        }
    }
    public int get(int key){
        if(head==null){
            return -1;
        }
        Node curNode=head;
        while(true){
            if(curNode.key==key){
                return curNode.value;
            }
            if(curNode.next==null){
                return -1;
            }
            curNode=curNode.next;
        }
    }
    //删除结点
    public void remove(int key){
        //如果头节点是空的，直接退出
        if(head==null){
            return;
        }
        //如果头节点不为空
        if(head.key==key){
            head=head.next;
            return;
        }
        //找到key
        Node curNode=head;
        while(true){
            if(curNode.next!=null&&curNode.next.key==key){
                curNode.next=curNode.next.next;
                return;
            }
            //没有找到该key
            if(curNode.next==null){
                System.out.println("没有该key");
                return;
            }
            curNode=curNode.next;
        }
    }
}
class Node{
    int key;
    int value;
    Node next;
}