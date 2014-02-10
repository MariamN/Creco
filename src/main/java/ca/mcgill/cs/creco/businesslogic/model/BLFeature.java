/**
 * Copyright 2014 McGill University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ca.mcgill.cs.creco.businesslogic.model;



/**
 * BLFeature represents a product feature in the consumer report database.
 * Can be combined in a BLFeatureList.
 *
 * @see BLFeatureList
 * @see BLProductAttribute
 */
public class BLFeature extends BLProductAttribute
{
	
	
	private BLFeatureType type;
	private String value;	
	
	public BLFeatureType getType()
	{
		return type;
	}
	public void setType(BLFeatureType type)
	{
		this.type = type;
	}
	public String getValue()
	{
		return value;
	}
	public void setValue(String value)
	{
		this.value = value;
	}
	

}

