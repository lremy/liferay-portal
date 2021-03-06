/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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
 */

package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ServiceComponent service. Represents a row in the &quot;ServiceComponent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.ServiceComponentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.ServiceComponentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ServiceComponent
 * @see com.liferay.portal.model.impl.ServiceComponentImpl
 * @see com.liferay.portal.model.impl.ServiceComponentModelImpl
 * @generated
 */
@ProviderType
public interface ServiceComponentModel extends BaseModel<ServiceComponent>,
	MVCCModel, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a service component model instance should use the {@link ServiceComponent} interface instead.
	 */

	/**
	 * Returns the primary key of this service component.
	 *
	 * @return the primary key of this service component
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this service component.
	 *
	 * @param primaryKey the primary key of this service component
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mvcc version of this service component.
	 *
	 * @return the mvcc version of this service component
	 */
	@Override
	public long getMvccVersion();

	/**
	 * Sets the mvcc version of this service component.
	 *
	 * @param mvccVersion the mvcc version of this service component
	 */
	@Override
	public void setMvccVersion(long mvccVersion);

	/**
	 * Returns the service component ID of this service component.
	 *
	 * @return the service component ID of this service component
	 */
	public long getServiceComponentId();

	/**
	 * Sets the service component ID of this service component.
	 *
	 * @param serviceComponentId the service component ID of this service component
	 */
	public void setServiceComponentId(long serviceComponentId);

	/**
	 * Returns the company ID of this service component.
	 *
	 * @return the company ID of this service component
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this service component.
	 *
	 * @param companyId the company ID of this service component
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the build namespace of this service component.
	 *
	 * @return the build namespace of this service component
	 */
	@AutoEscape
	public String getBuildNamespace();

	/**
	 * Sets the build namespace of this service component.
	 *
	 * @param buildNamespace the build namespace of this service component
	 */
	public void setBuildNamespace(String buildNamespace);

	/**
	 * Returns the build number of this service component.
	 *
	 * @return the build number of this service component
	 */
	public long getBuildNumber();

	/**
	 * Sets the build number of this service component.
	 *
	 * @param buildNumber the build number of this service component
	 */
	public void setBuildNumber(long buildNumber);

	/**
	 * Returns the build date of this service component.
	 *
	 * @return the build date of this service component
	 */
	public long getBuildDate();

	/**
	 * Sets the build date of this service component.
	 *
	 * @param buildDate the build date of this service component
	 */
	public void setBuildDate(long buildDate);

	/**
	 * Returns the data of this service component.
	 *
	 * @return the data of this service component
	 */
	@AutoEscape
	public String getData();

	/**
	 * Sets the data of this service component.
	 *
	 * @param data the data of this service component
	 */
	public void setData(String data);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.liferay.portal.model.ServiceComponent serviceComponent);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.portal.model.ServiceComponent> toCacheModel();

	@Override
	public com.liferay.portal.model.ServiceComponent toEscapedModel();

	@Override
	public com.liferay.portal.model.ServiceComponent toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}