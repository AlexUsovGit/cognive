<!-- This is Badge component. -->

<template>
  <div class="counter d-flex justify-content-center align-items-center">
    {{counter}}
  </div>
</template>

<script>
    export default {
      name: "BadgeComponent",
      props: {
        counter: {
          type: Number,
          required: true
        }
      }
    }
</script>

<style lang="scss" scoped>
  @import "../../assets/styles/core/core";

  .counter {
    height: $height-counter;
    min-width: $height-counter;
    font-size: 12px;
    font-weight: 600;
    color: rgba(255, 255, 255, 1);
    background-color: $color-danger;
    border-radius: $height-counter / 2;
    padding: 0 4px;
  }
</style>
