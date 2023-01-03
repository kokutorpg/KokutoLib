package net.kokutorpg.kokutolib.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class StandardItemBuilder implements ItemBuilder {

    private Material material;
    private final ItemStack is;
    private final ItemMeta im;

    public StandardItemBuilder(Material m) {
        this.material = m;
        this.is = new ItemStack(this.material, 1);
        this.im = this.is.getItemMeta();
    }

    @Override
    public ItemBuilder setDisplayName(String s) {
        im.setDisplayName(s);
        return this;
    }

    @Override
    public ItemBuilder setLore(List<String> sl) {
        im.setLore(sl);
        return this;
    }

    @Override
    public ItemBuilder setAmount(int i) {
        is.setAmount(i);
        return this;
    }

    @Override
    public ItemBuilder setUnbreakable(boolean b) {
        im.setUnbreakable(b);
        return this;
    }

    @Override
    public ItemBuilder setCustomModelData(Integer i) {
        im.setCustomModelData(i);
        return this;
    }

    @Override
    public ItemBuilder addItemFlag(ItemFlag flag) {
        im.addItemFlags(flag);
        return this;
    }

    @Override
    public ItemBuilder removeItemFlag(ItemFlag flag) {
        im.removeItemFlags(flag);
        return this;
    }

    @Override
    public ItemBuilder addItemFlags(ItemFlag... flags) {
        im.addItemFlags(flags);
        return this;
    }

    @Override
    public ItemBuilder removeItemFlags(ItemFlag... flags) {
        im.removeItemFlags(flags);
        return this;
    }

    @Override
    public ItemBuilder addEnchant(Enchantment enc, int level, boolean ignoreLevelLimit) {
        im.addEnchant(enc, level, ignoreLevelLimit);
        return this;
    }

    @Override
    public ItemBuilder removeEnchant(Enchantment enc) {
        im.removeEnchant(enc);
        return this;
    }

    @Override
    public ItemStack build() {
        is.setItemMeta(im);
        return is;
    }
}