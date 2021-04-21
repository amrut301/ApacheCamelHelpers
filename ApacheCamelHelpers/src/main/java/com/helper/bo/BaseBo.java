package com.helper.bo;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author amrmalaj
 * 
 *
 */
public class BaseBo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5709817023857110579L;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
