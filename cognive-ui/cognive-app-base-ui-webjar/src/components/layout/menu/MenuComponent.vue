<!-- Main menu component -->

<template>
  <nav
    :class="{'open': isOpen}"
    class="col menu position-sticky"
  >
    <div
      v-for="section of sections"
      :key="'section' + section.id"
    >
      <h6 class="title">
        {{section.title}}
      </h6>
      <menu-item-component
        v-for="item of section.items"
        :key="'item' + item.id"
        :item="item"
      />
      <hr class="line"/>
    </div>
  </nav>
</template>

<script>
    import MenuItemComponent from "@/components/layout/menu/components/MenuItemComponent"
    import MenuConfig from "@/../config/configs-temp/menu"

    export default {
      name: "MenuComponent",
      components: {MenuItemComponent},
      props: {
        isOpen: {
          type: Boolean,
          default: true
        }
      },
      data: function () {
        return {
          sections: MenuConfig.menu
        }
      }
    }
</script>

<style lang="scss" scoped>
  @import "../../../assets/styles/core/core";

  .menu {
    top: $header-height;
    height: calc(100vh - #{$header-height});
    max-width: $width-menu;
    background-color: $color-background-menu;
    border-right: $border-style;
    &.open {
      max-width: $width-menu-open;
    }
  }
  .title {
    margin-top: 25px;
    margin-bottom: 4px;
  }
  .line {
    border-top: $border-style;
    width: 126px;
    max-width: 100%;
    margin: 30px 0 0 0;
    &:last-child {
      display: none;
    }
  }
</style>
