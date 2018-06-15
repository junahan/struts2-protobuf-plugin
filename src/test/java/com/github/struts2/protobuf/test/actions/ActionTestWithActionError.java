/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.github.struts2.protobuf.test.actions;

import java.util.UUID;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.interceptor.ValidationAware;

public class ActionTestWithActionError extends TestAction implements ValidationAware {
	private static final long serialVersionUID = -4151436537246936316L;

	@Override
	public String execute() throws Exception {
		if (hasErrors()) return Action.ERROR;
		return Action.SUCCESS;
	}

	@Override
	public void validate() {
		addActionError(UUID.randomUUID().toString());
	}
	
}
