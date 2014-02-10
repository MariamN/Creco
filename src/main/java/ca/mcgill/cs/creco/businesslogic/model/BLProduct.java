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

import java.awt.image.BufferedImage;



/**
 * This class represents the products in the consumer report database
 * 
 * @see BLProductList
 */
public class BLProduct
{

	private String name;
	private int id;
	private BLRatingList ratings;
	private BLFeatureList feats;
	private String description;
	private String category;
	private BufferedImage picture;
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public BLRatingList getRatings()
	{
		return ratings;
	}
	public void setRatings(BLRatingList ratings)
	{
		this.ratings = ratings;
	}
	public BLFeatureList getFeats()
	{
		return feats;
	}
	public void setFeats(BLFeatureList feats)
	{
		this.feats = feats;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public String getCategory()
	{
		return category;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	public BufferedImage getPicture()
	{
		return picture;
	}
	public void setPicture(BufferedImage picture)
	{
		this.picture = picture;
	}
	
	
}
