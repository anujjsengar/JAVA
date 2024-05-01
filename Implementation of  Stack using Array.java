package Stack;

public class Stack {
	int[] st;
	int tos;
	public Stack(int size) {
		st=new int[size];
		tos=-1;
	}
	public boolean isempty() {
		if(tos==-1) {
			return true;
		}
		return false;
	}
	public int stacklen() {
		return tos+1;
	}
	public void push(int val) throws Exception {
		if(isfull()) {
			throw new Exception("Stack OverFlow due to Static Dynamic Memory Allocation");
		}
		else {
		tos=tos+1;
		st[tos]=val;
	}
	}
	public int pop() throws Exception{
		if(isempty()) {
			throw new Exception("Stack is Empty");
		}
		int x=st[tos];
		tos--;
		return x;
	}
	public int peak() {
		return st[tos];
	}
	public boolean isfull() {
		if(tos==st.length-1) {
			return true;
		}
		return false;
	}
	public void display() {
		System.out.println("Elements of Stack in Order");
		for(int i=tos;i>-1;i--) {
			System.out.println(st[i]);
		}
	}
	public static void main(String args[])throws Exception {
		Stack st=new Stack(10);
		System.out.println("IS EMPTY:"+st.isempty());
		System.out.println("IS Full:"+st.isfull());
		System.out.println("Size:"+st.stacklen());
		//st.pop();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(8);
		st.push(9);
		st.push(10);
		System.out.println(st.pop());
		System.out.println(st.peak());
		System.out.println("IS EMPTY:"+st.isempty());
		System.out.println("IS Full:"+st.isfull());
		System.out.println("Length:"+st.stacklen());
		//st.push(9);
		st.push(10);
		//st.push(11);
		st.display();
	}
}
