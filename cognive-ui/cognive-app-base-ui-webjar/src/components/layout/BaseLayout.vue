<!-- Layout for the base page of the project -->

<template>
  <div>
    <header-component
      :is-open="isOpen"
      @switchMenu="switchMenu"
    />
    <div class="container-fluid">
      <div class="row content">
        <menu-component :is-open="isOpen"/>
        <main class="col content-main">
          <router-view/>
        </main>
      </div>
    </div>
  </div>
</template>

<script>
    import HeaderComponent from "@/components/layout/header/HeaderComponent";
    import MenuComponent from "@/components/layout/menu/MenuComponent";

    export default {
      name: "BaseLayout",
      components: {
        MenuComponent,
        HeaderComponent
      },
      data: function () {
        return {
          // This variable switches the menu state: open or minimize
          isOpen: false
        }
      },
      methods: {
        switchMenu: function (data) {
          this.isOpen = data.isOpen
        }
      }
    }
</script>

<style lang="scss" scoped>
  @import "../../assets/styles/core/core";

  .content {
    min-height: calc(100vh - #{$header-height});
    background-color: $color-background;
  }
  .content-main {
    padding: {
      top: 40px;
      bottom: 40px;
    };
  }

</style>
