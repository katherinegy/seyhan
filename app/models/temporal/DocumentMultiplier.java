/**
* Copyright (c) 2015 Mustafa DUMLUPINAR, mdumlupinar@gmail.com
*
* This file is part of seyhan project.
*
* seyhan is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*/
package models.temporal;

import enums.Module;
import enums.Right;
import play.data.validation.Constraints;

/**
 * @author mdpinar
*/
public class DocumentMultiplier {

	@Constraints.Required
	public Integer id;

	@Constraints.Required
	public Module module;

	public String header;

	@Constraints.Required
	public Right right;

	@Constraints.Required
	@Constraints.MaxLength(30)
	public String name;

	@Constraints.MaxLength(30)
	public String description;

}
