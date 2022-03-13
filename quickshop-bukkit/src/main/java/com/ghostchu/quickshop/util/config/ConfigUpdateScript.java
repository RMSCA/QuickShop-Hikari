/*
 *  This file is a part of project QuickShop, the name is ConfigUpdateScript.java
 *  Copyright (C) Ghost_chu and contributors
 *
 *  This program is free software: you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the
 *  Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.ghostchu.quickshop.util.config;

import com.ghostchu.quickshop.QuickShop;
import lombok.Getter;
import org.bukkit.configuration.file.FileConfiguration;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class ConfigUpdateScript {
    private final QuickShop plugin;
    @Getter
    private final FileConfiguration config;

    public ConfigUpdateScript(@NotNull FileConfiguration config, @NotNull QuickShop plugin) {
        this.config = config;
        this.plugin = plugin;
    }

    @UpdateScript(version = 1000)
    public void updateCustomTranslationKey() {
        getConfig().set("custom-translation-key", new ArrayList<>());
    }

    @UpdateScript(version = 1001)
    public void shopName() {
        getConfig().set("shop.name-fee", 0);
        getConfig().set("shop.name-max-length", 32);
        getConfig().set("matcher.item.bundle", true);
    }

    @UpdateScript(version = 1002)
    public void adventureMiniMessage() {
        getConfig().set("syntax-parser", 0);
    }
}