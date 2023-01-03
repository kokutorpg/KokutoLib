package net.kokutorpg.kokutolib.items;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface ItemBuilder {

    /**
     * Set display name of item.
     * @param s Display name
     * @see org.bukkit.inventory.meta.ItemMeta#setDisplayName(String) ItemMeta.setDisplayName(String name)
     */
    ItemBuilder setDisplayName(String s);

    /**
     * Set description of item.
     * @param sl description
     * @see org.bukkit.inventory.meta.ItemMeta#setLore(List lore) ItemMeta.setLore(List lore)
     */
    ItemBuilder setLore(List<String> sl);

    /**
     * Set amount of item stack.
     * @param i Amount
     * @see org.bukkit.inventory.ItemStack#setAmount(int amount) ItemStack.setAmount(int amount)
     */
    ItemBuilder setAmount(int i);

    /**
     * Set unbreakable of item.
     * @param b true if set unbreakable of item
     * @see org.bukkit.inventory.meta.ItemMeta#setUnbreakable(boolean unbreakable) ItemMeta.setUnbreakable(boolean unbreakable)
     */
    ItemBuilder setUnbreakable(boolean b);

    /**
     * Set custom model data id of item.
     * @param i Custom Model Data ID if null clear
     * @see org.bukkit.inventory.meta.ItemMeta#setCustomModelData(Integer data) ItemMeta.setCustomModelData(Integer data)
     */
    ItemBuilder setCustomModelData(Integer i);

    /**
     * Add item flag of item
     * @param flag Item flag
     */
    ItemBuilder addItemFlag(ItemFlag flag);

    /**
     * Remove item flag of item
     * @param flag Item flag
     */
    ItemBuilder removeItemFlag(ItemFlag flag);

    /**
     * Add item flags of item
     * @param flags Item flags
     */
    ItemBuilder addItemFlags(ItemFlag... flags);

    /**
     * Remove item flags of item
     * @param flags Item Flags
     */
    ItemBuilder removeItemFlags(ItemFlag... flags);

    /**
     * Add enchant of item.
     * @param enc Enchant
     * @param level Enchant Level
     * @param ignoreLevelLimit Ignore enchant level default limit, if true.
     * @see org.bukkit.inventory.meta.ItemMeta#addEnchant(Enchantment ench, int level, boolean ignoreLevelRestriction)
     */
    ItemBuilder addEnchant(Enchantment enc, int level, boolean ignoreLevelLimit);

    /**
     * Remove enchant of item
     * @param enc Enchant
     * @see org.bukkit.inventory.meta.ItemMeta#removeEnchant(Enchantment ench) ItemMeta.removeEnchant(Enchantment ench)
     */
    ItemBuilder removeEnchant(Enchantment enc);

    /**
     * Create item stack.
     * @return Created ItemStack
     */
    ItemStack build();

}