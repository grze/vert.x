package org.vertx.java.core;

/*
 * Copyright 2013 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public interface Future<T> extends AsyncResult<T> {
  /**
   * Has it completed?
   */
  boolean complete();

  /**
   * Set a handler for the result. It will get called when it's complete
   */
  Future<T> setHandler(Handler<AsyncResult<T>> handler);

  /**
   * Set the result. Any handler will be called, if there is one
   */
  Future<T> setResult(T result);

  /**
   * Set the failure. Any handler will be called, if there is one
   */
  Future<T> setFailure(Throwable throwable);

}
