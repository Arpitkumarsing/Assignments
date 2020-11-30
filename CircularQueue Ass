public class CircularQueue {
	private int front;
	private int rear;

	private int size;
	private int Queue[];
	public CircularQueue()
	{

		this.front=-1;
		this.rear=0;
		this.size=8;
		Queue=new int[size];
	}
	public boolean isFull()
	{
		if(front == rear)
		{
			return true;
		}
		return false;
	}
	public boolean isEmpty()
	{
		if(front == -1)
		{
			return true;
		}
		return false;
	}
	public boolean enqueue(int data)
	{
		if(isFull())
		{
			return false;
		}
		else
		{
			Queue[rear]=data;
			if(front == -1)
			{
				front = rear;
			}
			rear = (rear+1)%Queue.length;
		}
		return true;
	}
	public boolean dequeue()
	{
		int element;
		if(isEmpty())
		{
			return false;
		}
		 element=Queue[front];
		front = (front+1)%Queue.length;
		if(front == rear)
		{
			front = -1;
		}
		return true;
	}
	void display()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.print(Queue[i]+" ");
		}
	}
	

	public static void main(String[] args) 
	{
		CircularQueue cq=new CircularQueue();
		cq.enqueue(45);
		cq.enqueue(67);
		cq.enqueue(78);
		cq.dequeue();
		cq.display();

	}

}
