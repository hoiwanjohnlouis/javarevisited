package com.jr2015.looppuzzlefail;

import java.util.ArrayList;

/**
 * Copyright 8/16/2015 by HW Tech Services, Inc., LLC
 * <p>
 * Package com.hwtechservices.jr2015.looppuzzlefail
 * Project looppuzzlefail
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

public class CustomCollection<T>{

    private ArrayList<T> bucket;

    public CustomCollection(){
        bucket = new ArrayList();
    }

    public int size() {
        return bucket.size();
    }

    public boolean isEmpty() {
        return bucket.isEmpty();
    }

    public boolean contains(T o) {
        return bucket.contains(o);
    }

    public boolean add(T e) {
        return bucket.add(e);
    }

    public boolean remove(T o) {
        return bucket.remove(o);
    }

}
