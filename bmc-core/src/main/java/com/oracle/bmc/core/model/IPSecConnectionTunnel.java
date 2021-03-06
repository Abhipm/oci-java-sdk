/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * information about IPSecConnection tunnel.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IPSecConnectionTunnel.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class IPSecConnectionTunnel {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vpnIp")
        private String vpnIp;

        public Builder vpnIp(String vpnIp) {
            this.vpnIp = vpnIp;
            this.__explicitlySet__.add("vpnIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpeIp")
        private String cpeIp;

        public Builder cpeIp(String cpeIp) {
            this.cpeIp = cpeIp;
            this.__explicitlySet__.add("cpeIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionInfo")
        private BgpSessionInfo bgpSessionInfo;

        public Builder bgpSessionInfo(BgpSessionInfo bgpSessionInfo) {
            this.bgpSessionInfo = bgpSessionInfo;
            this.__explicitlySet__.add("bgpSessionInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routing")
        private Routing routing;

        public Builder routing(Routing routing) {
            this.routing = routing;
            this.__explicitlySet__.add("routing");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStatusUpdated")
        private java.util.Date timeStatusUpdated;

        public Builder timeStatusUpdated(java.util.Date timeStatusUpdated) {
            this.timeStatusUpdated = timeStatusUpdated;
            this.__explicitlySet__.add("timeStatusUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IPSecConnectionTunnel build() {
            IPSecConnectionTunnel __instance__ =
                    new IPSecConnectionTunnel(
                            compartmentId,
                            id,
                            vpnIp,
                            cpeIp,
                            status,
                            lifecycleState,
                            displayName,
                            bgpSessionInfo,
                            routing,
                            timeCreated,
                            timeStatusUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IPSecConnectionTunnel o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .id(o.getId())
                            .vpnIp(o.getVpnIp())
                            .cpeIp(o.getCpeIp())
                            .status(o.getStatus())
                            .lifecycleState(o.getLifecycleState())
                            .displayName(o.getDisplayName())
                            .bgpSessionInfo(o.getBgpSessionInfo())
                            .routing(o.getRouting())
                            .timeCreated(o.getTimeCreated())
                            .timeStatusUpdated(o.getTimeStatusUpdated());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the compartment containing the tunnel.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The tunnel's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The IP address of Oracle's VPN headend.
     * <p>
     * Example: `129.146.17.50`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vpnIp")
    String vpnIp;

    /**
     * The IP address of Cpe headend.
     * <p>
     * Example: `129.146.17.50`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpeIp")
    String cpeIp;
    /**
     * The tunnel's current state.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Up("UP"),
        Down("DOWN"),
        DownForMaintenance("DOWN_FOR_MAINTENANCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The tunnel's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;
    /**
     * The IPSec connection's tunnel's lifecycle state.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The IPSec connection's tunnel's lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid
     * entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Information needed to establish a BGP Session on an interface.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionInfo")
    BgpSessionInfo bgpSessionInfo;
    /**
     * the routing strategy used for this tunnel, either static route or BGP dynamic routing
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Routing {
        Bgp("BGP"),
        Static("STATIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Routing> map;

        static {
            map = new java.util.HashMap<>();
            for (Routing v : Routing.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Routing(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Routing create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Routing', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * the routing strategy used for this tunnel, either static route or BGP dynamic routing
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routing")
    Routing routing;

    /**
     * The date and time the IPSec connection tunnel was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * When the status of the tunnel last changed, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusUpdated")
    java.util.Date timeStatusUpdated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
