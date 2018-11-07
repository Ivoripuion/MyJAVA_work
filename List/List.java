/**
*创建一个有关链表的类，包含了链表的创建以及一些基本对链表操作的方法。
*@author Tease
*@version v1.0.0
*/
public class List
{
	Link head=new Link(4);
	Link curr=head;
	List(int n){
		for(int x=0;x<n;x++){
			curr.next=new Link(4);
			curr=curr.next;
		}
	}
	/**
	*展示当前链表元素的值。
	*/
	void display(){
		curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	/**
	*追加一个元素的方法。
	*@param d 追加的元素的数值。
	*/
	void addNode(int d) {
        Link newLink = new Link(d);
        if (head == null) {
            head = newLink;
            return;
        }
        Link curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newLink;
    }

} 














