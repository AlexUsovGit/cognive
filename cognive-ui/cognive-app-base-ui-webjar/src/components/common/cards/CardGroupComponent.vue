<!-- This is Card Group component. It contains Card View components. -->

<template>
  <div class="row">
    <div class="col d-flex">
      <div
        v-for="card of cards"
        class="card-item"
      >
        <card-view-component :card="card"/>
      </div>
    </div>
  </div>
</template>

<script>
    import CardViewComponent from "@/components/common/cards/CardViewComponent";
    import CardsConfig from "@/../config/configs-temp/cards";

    export default {
      name: "CardGroupComponent",
      components: {CardViewComponent},
      data: function () {
        return {
          cards: CardsConfig.cards
        }
      }
    }
</script>

<style lang="scss" scoped>
  @import "../../../assets/styles/core/core";

  .card-item {
    padding: 0 25px;
    border-right: 1px solid $color-borders;
    &:last-of-type {
      border-right: none;
    }
  }
</style>
