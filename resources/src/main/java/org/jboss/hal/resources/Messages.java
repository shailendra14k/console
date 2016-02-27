/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
package org.jboss.hal.resources;


import com.google.gwt.safehtml.shared.SafeHtml;

public interface Messages extends com.google.gwt.i18n.client.Messages {

    //@formatter:off
    String activeRoles(String roles);
    String addResourceSuccess(String type, String name);
    String addResourceTitle(String text);
    String connectedTo(String url);
    SafeHtml emptyModelNodeForm();

    SafeHtml endpointError(String url);
    SafeHtml endpointOk(String url);

    String homepagePatchingSubHeader(String name);
    String homepagePatchingStandaloneStepIntro(String name);
    String homepagePatchingDomainStepIntro(String name);

    String invalidRange(long value, long min, long max);
    SafeHtml listHint();
    String messages(@PluralCount int count);
    String modifyResourceSuccess(String type, String name);
    String patternMismatch(String pattern);
    SafeHtml propertiesHint();
    String removeResourceConfirmationTitle(String name);
    SafeHtml removeResourceConfirmationQuestion(String name);
    String removeResourceSuccess(String type, String name);
    SafeHtml requiredHelp();
    SafeHtml requiredMarker();
    String updateAvailable(String current, String update);
    String unit(String unit);
    //@formatter:on
}
