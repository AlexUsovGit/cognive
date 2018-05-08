<!-- This component is for switching tabs. -->

<template>
  <div>
    <div class="row">
      <div class="col d-flex">
        <div
          v-for="tab of tabs"
          :key="'tab-' + tab.id"
          :class="{'active': tab.id === currentTab}"
          class="tab d-flex justify-content-center align-items-center"
          @click="switchTab(tab.id)"
        >
          <icon-svg
            v-if="tab.ico"
            :icon-name="tab.ico"
            class="icon"
          />
          <p class="label">
            {{tab.label}}
          </p>
          <badge-component
            v-if="tab.badge > 0"
            :counter="Number(tab.badge)"
          />
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col">
        <template v-for="tab of tabs">
          <div
            v-if="tab.id === currentTab"
            :key="'tab-content-' + tab.id"
          >
            <tab-render
              v-if="tab.component"
              :component-name="tab.component"
            />
          </div>
        </template>
      </div>
    </div>
  </div>
</template>

<script>
    import IconSvg from "@/components/common/icons/IconSvg";
    import BadgeComponent from "@/components/common/BadgeComponent";
    import TabRender from "@/components/common/tabs/TabRender";

    export default {
      name: "TabsComponent",
      components: {TabRender, BadgeComponent, IconSvg},
      props: {
        tabs: {
          type: Array,
          required: true
        }
      },
      data: function () {
        return {
          currentTab: this.tabs[0].id
        }
      },
      methods: {
        switchTab: function (id) {
          if (id !== this.currentTab) {
            this.currentTab = id;
          }
        }
      }
    }
</script>

<style lang="scss" scoped>
  @import "../../../assets/styles/core/core";

  .tab {
    padding: 0 50px;
    height: 36px;
    border-bottom: 1px solid $color-borders;
    cursor: pointer;
    margin-bottom: 20px;
    &:first-of-type {
      margin-left: 40px;
    }
    &:hover, &.active {
      border-bottom: 2px solid $color-main;
      .label {
        color: $color-main;
      }
    }
  }
  .label {
    font-size: 14px;
    font-weight: 600;
    color: $color-text-main;
    margin: 0;
  }
  .icon {
    margin-right: 5px
  }
  .badge {
    margin-left: 5px;
  }
</style>
