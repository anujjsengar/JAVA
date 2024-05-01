package Queue;

public class Queue {
    int queue[];
    int size = 0;
    int front = -1;
    int rear = -1;

    public Queue(int size) {
        queue = new int[size];
    }

    public int Size() {
        return size;
    }

    public void enqueue(int val) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Full! Cannot Enqueue Anymore");
            return;
        }
        rear++;
        queue[rear] = val;
        size++;
        if (front == -1) {
            front = 0;
        }
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Empty Queue! Cannot Dequeue Anymore");
            return;
        }
        size--;
        front++;
        if(front>rear) {
        	front=rear=-1;
        }
    }
    public void display() {
    	int i=front;
    	while(i<rear) {
    		System.out.print(queue[i]+" ");
    		i++;
    	}
    	System.out.println();
    }
    public void peek() {
    	System.out.println(queue[front]);
    }
    public boolean isEmpty() {
    	if(front==-1) {
    		return true;
    	}
    	return false;
    }
    public boolean isFull() {
    	if(rear==queue.length-1) {
    		return true;
    	}
    	return false;
    }
    public static void main(String args[]) {
        Queue que = new Queue(5);
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);
        que.enqueue(5);
        que.enqueue(6);
        que.display();
        que.peek();
        System.out.println("Is Empty:"+ que.isEmpty());
        System.out.println("Is Full:"+ que.isFull());
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();
    }
}
