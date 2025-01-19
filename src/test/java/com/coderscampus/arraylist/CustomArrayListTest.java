package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_one_item_to_list() {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(10);
		Integer expected_Result_for_add_1_item = sut.get(0);
		Integer expected_Size_for_add_1_item = sut.getSize();

		// Assert
		assertEquals(10, expected_Result_for_add_1_item);
		assertEquals(1, expected_Size_for_add_1_item);
	}

	@Test
	void should_add_11_items_to_list() {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		for (int i = 1; i <= 11; i++) {
			sut.add(i);
		}

		// Assert
		for (int i = 0; i < 11; i++) {
			assertEquals(i + 1, sut.get(i));
		}
		assertEquals(11, sut.getSize());
	}

	@Test
	void should_add_100000_items_to_list() {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		for (int i = 1; i <= 100000; i++) {
			sut.add(i);
		}

		// Assert
		for (int i = 0; i < 99999; i++) {
			assertEquals(i + 1, sut.get(i));
		}
		assertEquals(100000, sut.getSize());
	}

	@Test
	void should_add_one_item_at_specific_index_in_list() {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 1; i <= 11; i++) {
			sut.add(i);
		}

		// Act
		sut.add(4, 999);

		Integer expected_Result_for_add_1_item_at_index_4 = sut.get(4);
		Integer expected_Result_for_add_1_item_at_index_5 = sut.get(5);
		Integer expected_Size_for_add_1_item_at_index = sut.getSize();

		// Assert
		assertEquals(999, expected_Result_for_add_1_item_at_index_4);
		assertEquals(5, expected_Result_for_add_1_item_at_index_5);
		assertEquals(12, expected_Size_for_add_1_item_at_index);

	}

	@Test
	void should_remove_item_at_specified_index() {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 1; i <= 11; i++) {
			sut.add(i);
		}

		// Act
		sut.remove(4);
		Integer expected_Result_for_remove_item_at_index_4 = sut.get(4);
		Integer expected_Result_for_remove_item_at_index_5 = sut.get(5);
		Integer expected_Size_after_remove_item_at_index = sut.getSize();

		// Assert
		assertEquals(6, expected_Result_for_remove_item_at_index_4);
		assertEquals(7, expected_Result_for_remove_item_at_index_5);
		assertEquals(10, expected_Size_after_remove_item_at_index);

	}

}
