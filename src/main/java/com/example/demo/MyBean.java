/*
 * Copyright 2013-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

	@Autowired
	private MyConfig myConfig;

	@Autowired
	private DummyConfig dummyConfig;

	@Scheduled(fixedDelay = 5000)
	public void hello() {
		System.out.println("The first message is: " + this.myConfig.getMessage());
		System.out.println("The other message is: " + this.dummyConfig.getMessage());
	}

}
