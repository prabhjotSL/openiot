/**
 *    Copyright (c) 2011-2014, OpenIoT
 *    
 *    This file is part of OpenIoT.
 *
 *    OpenIoT is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU Lesser General Public License as published by
 *    the Free Software Foundation, version 3 of the License.
 *
 *    OpenIoT is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with OpenIoT.  If not, see <http://www.gnu.org/licenses/>.
 *
 *     Contact: OpenIoT mailto: info@openiot.eu
 */

package org.openiot.cupus.message.external;

import java.util.UUID;

import org.openiot.cupus.message.Message;

/**
 * This class is a subtype of class message and it is used for sending
 * disconnect request to broker form subscriber.
 * 
 * @author Eugen
 * 
 */
public class SubscriberUnregisterMessage implements Message {

	private static final long serialVersionUID = -4990453155644336896L;

	private String entityName;
	private UUID entityID;

	public SubscriberUnregisterMessage(String entityName, UUID entityID) {
		this.entityName = entityName;
		this.entityID = entityID;
	}

	public String getEntityName() {
		return entityName;
	}

	public UUID getEntityID() {
		return entityID;
	}

	@Override
	public UUID getID() {
		return entityID;
	}
}