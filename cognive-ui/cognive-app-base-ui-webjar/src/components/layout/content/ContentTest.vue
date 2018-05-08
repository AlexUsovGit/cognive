<!-- This component uses for testing common components. -->

<template>
  <div>
    <card-group-component/>
    <hr/>
    <tabs-component :tabs="tabs"/>
  </div>
</template>

<script>
    import TabsComponent from "@/components/common/tabs/TabsComponent";
    import TabsConfig from "@/../config/configs-temp/tabs"
    import CardGroupComponent from "@/components/common/cards/CardGroupComponent";

    export default {
        name: "ContentTest",
        components: {CardGroupComponent, TabsComponent},
        data: function () {
          return {
            tabs: TabsConfig.tabs
          }
        }
    }
</script>

<style lang="scss" scoped>

</style>
