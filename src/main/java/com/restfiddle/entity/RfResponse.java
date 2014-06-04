/*
 * Copyright 2014 Ranjan Kumar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.restfiddle.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class RfResponse extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @OneToOne(mappedBy = "rfResponse")
    private Item item;

    public Item getItem() {
	return item;
    }

    public void setItem(Item item) {
	this.item = item;
    }
}