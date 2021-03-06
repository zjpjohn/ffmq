/*
 * This file is part of FFMQ.
 *
 * FFMQ is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * FFMQ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FFMQ; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package net.timewalker.ffmq4.storage.data.impl.journal;

import net.timewalker.ffmq4.storage.data.DataStoreException;

/**
 * JournalException
 */
public final class JournalException extends DataStoreException
{
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructor
     */
    public JournalException(String message)
    {
        super(message);
    }
    
    /**
     * Constructor
     */
    public JournalException(String message, Exception linkedException)
    {
        super(message,linkedException);
    }
    
    /*
     * (non-Javadoc)
     * @see javax.jms.JMSException#getErrorCode()
     */
    @Override
	public String getErrorCode()
    {
    	return "JOURNAL_ERROR";
    }
}
