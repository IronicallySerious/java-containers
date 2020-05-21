package containers;

public class LinkedList<T>
{
	public class Node<T>
	{
		public T m_Data;
		public Node<T> m_Next;

		Node(T data)
		{
			m_Data = data;
			m_Next = null;
		}
	}

	private Node<T> m_Start;

	public void add(T data)
	{
		if(m_Start == null)
		{
			m_Start = new Node<T>(data);
		}
		else
		{
			Node<T> newNode = new Node<T>(data);

			Node<T> end = m_Start;
			while(end.m_Next != null)
			{
				end = end.m_Next;
			}

			end.m_Next = newNode;
		}
	}

	public void remove(T data)
	{
		// Underflow
		if(m_Start == null)
		{
			return;
		}

		if(m_Start.m_Data.equals(data))
		{
			// Single element left?
			if(m_Start.m_Next == null)
			{
				m_Start = null;
				return;
			}

			m_Start = m_Start.m_Next;
			return;
		}

		Node<T> node = m_Start;
		Node<T> parent = null;
		while(node != null)
		{
			if(node.m_Data.equals(data))
			{
				parent.m_Next = node.m_Next;
				node = null;
				return;
			}

			parent = node;
			node = node.m_Next;
		}
	}

	public boolean contains(T data)
	{
		Node<T> node = m_Start;
		while(node != null)
		{
			if(node.m_Data.equals(data))
			{
				return true;
			}

			node = node.m_Next;
		}

		return false;
	}

	public String toString()
	{
		StringBuilder builder = new StringBuilder();

		builder.append("[ ");

		Node<T> node = m_Start;
		while(node != null)
		{
			builder.append(node.m_Data).append(' ');

			node = node.m_Next;
		}

		builder.append(']');

		return builder.toString();
	}
}
