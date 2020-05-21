package containers;

public class ArrayList<T>
{
	static final int s_SizeMultiplier = 2;
	private Object m_Elements[];
	private int m_OccupiedCount;

	public ArrayList()
	{
		m_Elements = new Object[0];
		m_OccupiedCount = 0;
	}

	public void add(T addition)
	{
		if(shouldExpand())
		{
			expand();
		}

		m_Elements[m_OccupiedCount] = addition;
		m_OccupiedCount++;
	}

	public T get(int index)
	{
		// Unchecked cast for best performance for now
		return (T)m_Elements[index];
	}

	public void set(int index, T item)
	{
		m_Elements[index] = item;
	}

	public void remove(int index)
	{
		m_Elements[index] = null;

		for(int i = index; i < m_OccupiedCount; i++)
		{
			m_Elements[i] = m_Elements[i + 1];
		}

		m_OccupiedCount--;
	}

	public void insert(int index, T insertion)
	{
		if(shouldExpand())
		{
			expand();
		}

		for(int i = m_OccupiedCount; i != index; i--)
		{
			m_Elements[i] = m_Elements[i - 1];
		}

		m_Elements[index] = insertion;
		m_OccupiedCount++;
	}

	public String toString()
	{
		StringBuilder result = new StringBuilder(new String("[ "));

		for(int i = 0; i < m_OccupiedCount; i++)
		{
			result.append(m_Elements[i].toString()).append(" ");
		}

		result.append("]");

		return result.toString();
	}

	private boolean shouldExpand()
	{
		return m_OccupiedCount == m_Elements.length;
	}

	private void expand()
	{
		int newSize = m_Elements.length == 0 ? 1 : m_Elements.length * s_SizeMultiplier;

		Object newArray[] = new Object[newSize];

		for(int i = 0; i < m_Elements.length; i++)
		{
			newArray[i] = m_Elements[i];
		}

		m_Elements = newArray;
	}
}
