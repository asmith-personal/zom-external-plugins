/*
 * Copyright (c) 2019, Jordan Zomerlei <https://github.com/JZomerlei>
 * All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *     list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *     this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.zom.leftclickdrop;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("leftclickdrop")
public interface MenuSwapperConfig extends Config
{
	@ConfigItem(
		keyName = "itemList",
		name = "Item list to left click drop",
		description = "Comma delimited list of items you want to left click drop.<br>Only supports full matching names and only with items that have only have use,drop,examine and cancel options.",
		position = 1
	)
	default String itemList()
	{
		return "";
	}

	@ConfigItem(
		keyName = "dragDelayEnable",
		name = "Anti Drag",
		description = "Enable anti drag on items listed above",
		position = 2
	)
	default boolean antiDragEnable()
	{
		return true;
	}

	@ConfigItem(
		keyName = "dragDelayTicks",
		name = "Ticks of delay",
		description = "Game ticks until the item is able to be dragged (20ms/tick)",
		position = 3
	)
	default int antiDragDelay()
	{
		return 5;
	}
}
