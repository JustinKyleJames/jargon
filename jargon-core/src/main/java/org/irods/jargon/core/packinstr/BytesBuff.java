/**
 *
 */
package org.irods.jargon.core.packinstr;

import org.irods.jargon.core.exception.JargonException;

/**
 * Translation of a BytesBuf_PI into XML protocol format.This is used for
 * pluggable API calls
 * 
 * #define BytesBuf_PI "int buflen; char *buf(buflen);"
 *
 * @author Mike Conway - DICE (www.irods.org)
 *
 */
public class BytesBuff extends AbstractIRODSPackingInstruction {

	public static final String PI_TAG = "BytesBuf_PI";

	private final String buffer;

	public static final BytesBuff instance(final String buffer, final int apiNumber) throws JargonException {
		return new BytesBuff(buffer, apiNumber);
	}

	private BytesBuff(final String buffer, final int apiNumber) throws JargonException {
		super();
		if (buffer == null) {
			throw new JargonException("buffer is null");
		}
		this.buffer = buffer;
		this.setApiNumber(apiNumber);
	}

	@Override
	public Tag getTagValue() throws JargonException {
		Tag startupPacket = new Tag(PI_TAG, new Tag[] { new Tag("buflen", buffer.length()), new Tag("buf", buffer), });
		return startupPacket;
	}
}
