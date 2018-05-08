<!--This is a component for the Login page.
It contains all states of recovering of the password: forgot, sent, reset -->

<template>
    <div class="container-fluid">
      <div class="row row-main align-items-center">
        <div class="col">
          <div class="form-container text-center">

            <img
              src="../../assets/images/logo-full.png"
              class="logo"
            />

            <template v-if="currentScreen === 'forgot'">
              <h2 class="caption">
                Forgot Password?
              </h2>

              <form
                novalidate
                class="text-left"
                @submit.prevent="send"
              >

                <div class="form-group">
                  <label for="email">
                    Email
                  </label>
                  <input
                    id="email"
                    v-model="email"
                    :class="{'invalid': !emailValid}"
                    type="email"
                    required
                    class="form-control"
                    placeholder="Enter your email"
                  />
                  <div
                    v-if="!emailValid"
                    class="invalid-feedback"
                  >
                    It doesn't looks like an email
                  </div>
                </div>

                <p class="instruction text-center">
                  Enter your email address below and we will<br/>
                  send you password reset instructions.
                </p>

                <button
                  type="submit"
                  class="btn-cgn btn-cgn-prim btn-cgn-xl"
                >
                  Send
                </button>

              </form>
            </template>

            <template v-else-if="currentScreen === 'sent'">
              <p class="instruction text-center">
                An e-mail with further instructions has been sent to<br/>
                {{email}}
              </p>
              <img
                src="../../assets/images/recovery-sent.png"
                class="sent"
              />
            </template>

            <template v-if="currentScreen === 'reset'">
              <h2 class="caption">
                Reset the Password
              </h2>

              <form
                novalidate
                class="text-left"
                @submit.prevent="savePassword"
              >

                <div class="form-group password-group">
                  <label for="password">
                    New Password
                  </label>
                  <input
                    id="password"
                    v-model="password"
                    :class="{'invalid': !passwordValid}"
                    :type="isPasswordSymbolsHided ? 'password' : 'text'"
                    required
                    class="form-control password-input"
                    placeholder="Enter new password"
                  />
                  <div
                    class="password-toggle"
                    @click="togglePasswordDisplay"
                  >
                    <icon-svg
                      :icon-name="isPasswordSymbolsHided ? 'icon_24_ic_visibility_off' : 'icon_24_ic_visibility'"
                      :icon-color="passwordValid ? '#C7C7CC' : 'white'"
                    />

                  </div>
                </div>

                <p class="instruction text-center">
                  The password must be at least 6 characters long,<br/>
                  contain numbers and letters only.
                </p>

                <button
                  type="submit"
                  class="btn-cgn btn-cgn-prim btn-cgn-xl"
                >
                  Save Password
                </button>

              </form>
            </template>

            <p v-if="currentScreen !== 'reset'">
              <router-link
                :to="{name: 'Login'}"
                class="back"
              >
                Back to Login
              </router-link>
            </p>

          </div>
        </div>
      </div>
    </div>
</template>

<script>
    import IconSvg from "@/components/common/icons/IconSvg";
    export default {
      name: "RecoveryPage",
      components: {IconSvg},
      props: {
        token: {
          type: String,
          required: false
        }
      },
      data: function () {
        return {
          /* This variable switches page states:
          forgot - form with email,
          sent - after user submit form with email
          reset - reset old password */
          currentScreen: 'forgot',
          email: '',
          emailValid: true,
          password: '',
          passwordValid: true,
          isPasswordSymbolsHided: true
        }
      },
      created: function() {
        // This if decides what state have to be shown. If token has been passed we have to choose reset
        if (this.token) {
          this.currentScreen = 'reset'
        }
      },
      methods: {
        send: function () {
          if (this.email === '' || !this.checkEmail(this.email)) {
            this.emailValid = false;
          } else {
            this.emailValid = true;
            this.currentScreen = 'sent';
          }
        },

        // This function checks email. If email is valid it returns true
        checkEmail: function (email) {
          const re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
          return re.test(email)
        },

        togglePasswordDisplay: function() {
          this.isPasswordSymbolsHided = !this.isPasswordSymbolsHided;
        },

        savePassword: function () {
          if (!this.checkPassword(this.password)) {
            this.passwordValid = false;
          } else {
            this.passwordValid = true;
            this.$router.push({name: 'Login'})
          }
        },

        // This function checks password. If password is valid it returns true
        checkPassword(password) {
          if (this.password.length < 7) {
            return false;
          } else {
            const re = /^[a-z0-9]+$/i;
            return re.test(password)
          }
        }
      }
    }
</script>

<style lang="scss" scoped>
  @import "../../assets/styles/core/core";

  .row-main {
    min-height: 100vh;
    background-color: $color-background;
  }
  .form-container {
    width: 100%;
    max-width: 360px;
    margin: 0 auto;
  }
  .logo {
    margin-bottom: 70px;
  }
  .caption {
    margin-bottom: 25px;
  }
  .instruction {
    font-size: 12px;
    font-weight: 600;
    color: $color-text-main;
    margin-bottom: 36px;
  }
  .btn-cgn {
    display: block;
    margin: 0 auto 30px auto;
  }
  .back {
    font-size: 12px;
    font-weight: bold;
  }
  .sent {
    margin-bottom: 74px;
  }
  .password-group {
    position: relative;
  }
  .password-toggle {
    position: absolute;
    right: 10px;
    top: 35px;
  }
  .password-input {
    padding-right: 44px;
  }
  .invalid + .instruction {
    color: $color-danger;
  }
</style>
