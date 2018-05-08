<!-- This is Card View component.-->

<template>
  <div class="card-view d-flex align-items-center">
    <div v-if="card.image">
      <img
        :src="image"
        class="card-image"
      />
    </div>
    <div>
      <p class="card-label">{{card.label}}</p>
      <h1 class="card-value">{{card.value}}</h1>
    </div>
  </div>
</template>

<script>
    export default {
      name: "CardViewComponent",
      props: {
        card: {
          type: Object,
          required: true
        }
      },
      computed: {
        // Temporary decision for local images. In future link will be sent from the API.
        image: function () {
          return require('@/assets/images/' + this.card.image);
        }
      }
    }
</script>

<style lang="scss" scoped>
  @import "../../../assets/styles/core/core";

  .card-view {
    height: 46px;
  }
  .card-image {
    max-height: 46px;
    margin-right: 16px;
  }
  .card-label {
    font-size: 13px;
    color: $color-text-light;
    margin-bottom: 0;
  }
  .card-value {
    margin-bottom: 0;
  }
</style>
