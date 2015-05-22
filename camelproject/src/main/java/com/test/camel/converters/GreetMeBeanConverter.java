/**
 * 
 */
package com.test.camel.converters;

import org.apache.camel.Exchange;
import org.apache.camel.NoTypeConversionAvailableException;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverter;

import com.test.camel.service.impl.GreetMeBean;

/**
 * @author josephj001
 *
 */
public class GreetMeBeanConverter implements TypeConverter {

	/* (non-Javadoc)
	 * @see org.apache.camel.TypeConverter#allowNull()
	 */
	@Override
	public boolean allowNull() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.apache.camel.TypeConverter#convertTo(java.lang.Class, java.lang.Object)
	 */
	@Override
	public <T> T convertTo(Class<T> arg0, Object value)
			throws TypeConversionException {
		GreetMeBean greetMeBean = new GreetMeBean();
		greetMeBean.setMessageFromJms(value.toString());
        return (T) greetMeBean;
	}

	/* (non-Javadoc)
	 * @see org.apache.camel.TypeConverter#convertTo(java.lang.Class, org.apache.camel.Exchange, java.lang.Object)
	 */
	@Override
	public <T> T convertTo(Class<T> type, Exchange arg1, Object value)
			throws TypeConversionException {
		return convertTo(type, value);
	}

	/* (non-Javadoc)
	 * @see org.apache.camel.TypeConverter#mandatoryConvertTo(java.lang.Class, java.lang.Object)
	 */
	@Override
	public <T> T mandatoryConvertTo(Class<T> type, Object value)
			throws TypeConversionException, NoTypeConversionAvailableException {
		// TODO Auto-generated method stub
		return convertTo(type, value);
	}

	/* (non-Javadoc)
	 * @see org.apache.camel.TypeConverter#mandatoryConvertTo(java.lang.Class, org.apache.camel.Exchange, java.lang.Object)
	 */
	@Override
	public <T> T mandatoryConvertTo(Class<T> type, Exchange arg1, Object value)
			throws TypeConversionException, NoTypeConversionAvailableException {
		// TODO Auto-generated method stub
		return convertTo(type, value);
	}

	/* (non-Javadoc)
	 * @see org.apache.camel.TypeConverter#tryConvertTo(java.lang.Class, java.lang.Object)
	 */
	@Override
	public <T> T tryConvertTo(Class<T> type, Object value) {
		// TODO Auto-generated method stub
		return convertTo(type, value);
	}

	/* (non-Javadoc)
	 * @see org.apache.camel.TypeConverter#tryConvertTo(java.lang.Class, org.apache.camel.Exchange, java.lang.Object)
	 */
	@Override
	public <T> T tryConvertTo(Class<T> type, Exchange arg1, Object value) {
		// TODO Auto-generated method stub
		return convertTo(type, value);
	}

}
