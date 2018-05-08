<!-- Component for menu item -->

<template>
  <router-link
    :to="item.link"
    exact
    class="menu-item"
  >
    <div class="item-content">
      <div class="item-label">
        <icon-svg
          :icon-name="item.icon"
          class="item-icon"
        />
        <div class="item-text">
          {{item.label}}
        </div>
      </div>
      <div v-if="item.count > 0">
        <badge-component :counter="item.count"/>
      </div>
    </div>
  </router-link>
</template>

<script>
    import IconSvg from "@/components/common/icons/IconSvg";
    import BadgeComponent from "@/components/common/BadgeComponent";

    export default {
      name: "MenuItemComponent",
      components: {BadgeComponent, IconSvg},
      props: {
        item: {
          type: Object,
          required: true
        }
      }
    }
</script>

<style lang="scss" scoped>
  @import "../../../../assets/styles/core/core";

  .menu-item {
    height: 44px;
    display: flex;
    align-items: center;
    font-size: 14px;
    font-weight: 600;
    color: $color-text-main;
    margin-left: -16px;
    margin-right: -16px;
    padding-left: 8px;
    padding-right: 8px;
    &.router-link-active {
      border-left: 4px solid $color-main;
      .item-content {
        color: $color-main;
        background-color: $color-background;
      }
    }
    &:hover {
      text-decoration: none !important;
      .item-content {
        color: $color-main;
        background-color: $color-background;
      }
    }
  }
  .item-content {
    width: 100%;
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding-left: 8px;
    padding-right: 8px;
  }
  .item-label {
    display: flex;
    align-items: center;
  }
  .item-icon {
    margin-right: 10px;
    min-width: 24px;
  }
  .item-text {
    display: none;
  }
  .open .item-text {
    display: block;
  }
</style>
