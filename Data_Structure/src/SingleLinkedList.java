public class SingleLinkedList {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "ss", "aa");
        HeroNode hero2 = new HeroNode(2, "ss", "aa");
        HeroNode hero3 = new HeroNode(3, "ss", "aa");
        LinkedList single = new LinkedList();
        single.add(hero1);
        single.add(hero2);
        single.add(hero3);
        single.list();
    }
}

//定义SingleLinkedList 管理英雄
class LinkedList{
    //先初始化一个头节点(头节点不动)
    private  HeroNode head = new HeroNode(0,"","");

    //添加节点到单项链表
    //思路：当不考虑编号顺序时：
    //找到当前链表的最后节点并将这个最后节点的next指向新的节点
    public void add(HeroNode heroNode){
        HeroNode temp = head;
        while(true){
            if(temp.next == null){
                break;
            }
            temp=temp.next;
        }
        //当退出while循环时，temp指向链表的最后
        temp.next=heroNode;
    }

    public void list(){
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp=head.next;
        while(true){
            if(temp==null)
                break;
            System.out.println(temp);
            temp=temp.next;
        }
    }
}

class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;   //指向下一个节点
    public HeroNode(int no,String name,String nickname){
        this.no=no;
        this.name=name;
        this.nickname=nickname;
    }

    //重写toString（alt+insert）
    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\''+"}";
    }

}

