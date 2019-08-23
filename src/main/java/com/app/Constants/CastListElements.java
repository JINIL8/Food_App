package com.app.Constants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author disha
 *
 */
public final class CastListElements {

	/**
	 * private constructor for utility class. This will not allow to create
	 * instance of object from application.
	 */
	private CastListElements() {

		super();
	}

	/**
	 * @param clazz
	 * @param collection
	 * @return
	 */
	public static <T> List<T> castList(final Class<? extends T> clazz, final Collection<?> collection) {

		final List<T> row = new ArrayList<>(collection.size());
		for (final Object object : collection) {
			row.add(clazz.cast(object));
		}
		return row;
	}
}
