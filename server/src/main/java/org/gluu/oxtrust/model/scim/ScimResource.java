/*
 * oxTrust is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2014, Gluu
 */

package org.gluu.oxtrust.model.scim;

/**
 * SCIM Resources for bulk use
 * 
 * @author Reda Zerrad Date: 04.18.2012
 */

public class ScimResource {

	private ScimPerson person;
	private ScimGroup group;

	public ScimPerson getPerson() {
		return this.person;
	}

	public void setPerson(ScimPerson person) {

		this.person = person;
	}

	public ScimGroup getGroup() {
		return this.group;
	}

	public void setGroup(ScimGroup group) {

		this.group = group;
	}
}
