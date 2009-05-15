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
package org.openmrs.module.indicator.evaluator;

import org.openmrs.module.evaluation.EvaluationContext;
import org.openmrs.module.indicator.Indicator;
import org.openmrs.module.indicator.IndicatorResult;

/**
 * This interfaces provides the functionality to evaluate an Indicator and return a result.
 */
public interface IndicatorEvaluator {
	
	/**
	 * Evaluates an Indicator based on the passed EvaluationContext
	 * @param indicator Indicator to evaluate
	 * @param context context to use during evaluation
	 * @return an IndicatorResult representing the Indicator evaluation result
	 */
	public IndicatorResult evaluate(Indicator indicator, EvaluationContext context);
		
}
