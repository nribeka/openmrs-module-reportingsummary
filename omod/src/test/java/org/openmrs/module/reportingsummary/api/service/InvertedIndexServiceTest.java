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

package org.openmrs.module.reportingsummary.api.service;

import java.util.Date;
import java.util.List;

import junit.framework.Assert;
import org.junit.Test;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.reporting.common.TimeQualifier;
import org.openmrs.module.reporting.data.DataDefinition;
import org.openmrs.module.reporting.data.converter.DataConverter;
import org.openmrs.module.reporting.dataset.definition.PatientDataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.RowPerObjectDataSetDefinition;
import org.openmrs.module.reportingsummary.api.InvertedIndex;
import org.openmrs.test.BaseModuleContextSensitiveTest;

public class InvertedIndexServiceTest extends BaseModuleContextSensitiveTest {

    @Test
    public void saveInvertedIndex() throws Exception {

        Patient patient = Context.getPatientService().getPatient(7);

        InvertedIndex invertedIndex = new InvertedIndex();
        invertedIndex.setGeneratedBy(Context.getAuthenticatedUser());
        invertedIndex.setGeneratedOn(new Date());
        invertedIndex.setPatient(patient);
        invertedIndex.setDefinition(new PatientDataSetDefinition());

        Context.getService(InvertedIndexService.class).saveInvertedIndex(invertedIndex);

        Assert.assertNotNull(invertedIndex.getId());
    }

}
