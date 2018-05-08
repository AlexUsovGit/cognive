<!-- There is component with logo and menu toggle -->

<template>
  <div
    class="navbar-brand"
    :class="{'open': isOpen}"
  >
    <span @click="switchMenu">
      <icon-svg iconName="icon_24_ic_view_headline"/>
    </span>
    <img
      src="../../../../assets/images/logo-full.png"
      v-if="isOpen"
      class="logo"
    />
  </div>
</template>

<script>
    import IconSvg from "@/components/common/icons/IconSvg";

    export default {
      name: "HeaderLogo",
      components: {
        IconSvg
      },
      props: {
        isOpen: {
          type: Boolean,
          default: true
        }
      },
      data: function () {
        return {
          isOpenLocal: this.isOpen
        }
      },
      methods: {
        switchMenu: function () {
          this.isOpenLocal = !this.isOpenLocal;
          this.$emit('switchMenu', {isOpen: this.isOpenLocal});
        }
      }
    }
</script>

<style lang="scss" scoped>
  @import "../../../../assets/styles/core/core";

  .navbar-brand {
    background-color: $color-background-menu;
    width: $width-menu;
    margin-left: -16px;
    padding-left: 16px;
    font-size: 24px;
    padding-top: ($header-height - 24px) / 2;
    padding-bottom: ($header-height - 24px) / 2;
    border-right: $border-style;
    &.open {
      width: $width-menu-open;
    }
  }
  .logo {
    height: 24px;
    margin-left: 30px;
  }
</style>
