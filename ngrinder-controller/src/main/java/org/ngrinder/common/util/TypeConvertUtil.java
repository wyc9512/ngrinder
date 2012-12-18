/* 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package org.ngrinder.common.util;

/**
 * Convenient class for type conversion.
 * 
 * @author JunHo Yoon
 * @since 3.1
 */
public abstract class TypeConvertUtil {
	

	/**
	 * Convert object to return type.
	 * 
	 * @param object
	 *            object to be converted.
	 * @param <T>
	 *            converted type
	 * @return converted object.
	 */
	@SuppressWarnings("unchecked")
	public static <T> T convert(Object object) {
		return (T) object;
	}
}
