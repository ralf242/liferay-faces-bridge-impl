/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.faces.bridge.context.internal;

import javax.portlet.PortletContext;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.faces.Bridge;


/**
 * This class provides a compatibility layer that isolates differences between Portlet 2.0 and 3.0.
 *
 * @author  Neil Griffin
 */
public abstract class ExternalContextCompat_Portlet3_Impl extends ExternalContextCompat_2_3_Impl {

	public ExternalContextCompat_Portlet3_Impl(PortletContext portletContext, PortletRequest portletRequest,
		PortletResponse portletResponse) {
		super(portletContext, portletRequest, portletResponse);
	}

	@Override
	protected boolean isHeaderPhase(Bridge.PortletPhase portletPhase) {
		return (portletPhase == Bridge.PortletPhase.HEADER_PHASE);
	}

	@Override
	protected boolean isHeaderPhaseSupported() {
		return true;
	}
}
