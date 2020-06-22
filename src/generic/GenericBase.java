package generic;

public class GenericBase<K, V> {

	private K key;
	private V value;

	public GenericBase(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

}
