<!-- Main component for header -->

<template>
  <header class="navbar position-sticky">
    <header-logo
      :is-open="isOpen"
      @switchMenu="switchMenu"
    />
    <div class="form-inline">
      <header-notification/>
      <header-help/>
      <header-user/>
    </div>
  </header>
</template>

<script>
    import HeaderLogo from "@/components/layout/header/components/HeaderLogo";
    import HeaderNotification from "@/components/layout/header/components/HeaderNotification";
    import HeaderHelp from "@/components/layout/header/components/HeaderHelp";
    import HeaderUser from "@/components/layout/header/components/HeaderUser";

    export default {
      name: "HeaderComponent",
      components: {
        HeaderUser,
        HeaderHelp,
        HeaderNotification,
        HeaderLogo
      },
      props: {
        isOpen: {
          type: Boolean,
          default: true
        }
      },
      methods: {
        switchMenu: function (data) {
          this.$emit('switchMenu', {isOpen: data.isOpen})
        }
      }
    }
</script>

<style lang="scss" scoped>
  @import "../../../assets/styles/core/core";

  .navbar {
    height: $header-height;
    top: 0;
    z-index: 1071;
    background-color: $color-background-white;
    overflow-y: hidden;
    border-bottom: $border-style;
  }
</style>
