package com.dataStructures.hashtable;

import java.util.Arrays;

public class HashTable {

	class Data {

		int key;

		String value;

		Data(int key, String value) {
			this.key = key;
			this.value = value;

		}

		@Override
		public String toString() {
			return "Data{" + "key=" + key + ", value='" + value + '\'' + '}';
		}
	}

	int size;
	Data[] data;
	HashTable(int size) {
		this.size = size;
		this.data = new Data[size];

	}

	int hash(int key) {
		return (size + key) % size;
	}

	String get(int key) {

		int address = hash(key);

		return data[address].value;
	}

	HashTable set(int key, String value)

	{
		int address = hash(key);
		data[address] = new Data(key, value);

		return this;

	}

	void keys() {

		for (Data data : data) {
			if (data != null && data.value != null) {
				System.out.println(data.key);
			}

		}

	}

	@Override
	public String toString() {
		return "HashTable{" + "size=" + size + ", data=" + Arrays.toString(data) + '}';
	}

	public static void main(String[] args) {
		HashTable hashTable = new HashTable(10);
		System.out.println(hashTable.set(1, "hi"));
		System.out.println(hashTable.set(2, "bye"));
		System.out.println(hashTable.set(1, "hi"));
		System.out.println(hashTable.get(2));
		hashTable.keys();
	}

}
