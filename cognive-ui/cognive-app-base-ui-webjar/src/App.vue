<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style lang="scss">
  @import "~bootstrap/scss/bootstrap";

  #app {
    @import "assets/styles/cognive";
  }
</style>
