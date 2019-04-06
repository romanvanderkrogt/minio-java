/*
 * MinIO Java SDK for Amazon S3 Compatible Cloud Storage, (C) 2015 MinIO, Inc.
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

package io.minio.errors;


/**
 * Thrown to indicate that given objectprefix is not valid.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class InvalidObjectPrefixException extends MinioException {
  private final String objectPrefix;


  /**
   * Constructs a new InvalidObjectPrefixException with objectPrefix caused the error and error message.
   */
  public InvalidObjectPrefixException(String objectPrefix, String message) {
    super(message);
    this.objectPrefix = objectPrefix;
  }


  @Override
  public String toString() {
    return this.objectPrefix + ": " + super.toString();
  }
}
