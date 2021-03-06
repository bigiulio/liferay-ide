/*******************************************************************************
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *******************************************************************************/

package com.liferay.ide.templates.core;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cindy Li
 */
public class TemplateContext implements ITemplateContext
{
    private Map<String, Object> context = new HashMap<String, Object>();

    public boolean containsKey( String key )
    {
        return context.containsKey( key );
    }

    public Map<String, Object> getMap()
    {
        return context;
    }

    public Object put( String key, Object value )
    {
        return context.put( key, value );
    }

}
