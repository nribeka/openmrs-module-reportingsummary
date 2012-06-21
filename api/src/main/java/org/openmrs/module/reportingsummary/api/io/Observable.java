/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.reportingsummary.api.io;

public interface Observable {

    /**
     * Attach an observer to this observable object. The observer will start getting notification from this object.
     *
     * @param observer the observer
     */
    void attach(final Observer observer);

    /**
     * Detach an observer from this observable object. The observer will no longer get notification from this object.
     *
     * @param observer the observer
     */
    void detach(final Observer observer);

    /**
     * Publish a certain event to the observer list
     */
    void publish();

}
